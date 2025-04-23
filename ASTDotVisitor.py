# ASTDotVisitor.py
from generated.lensVisitor import lensVisitor

class ASTDotVisitor(lensVisitor):
    def __init__(self):
        self.result = ["digraph AST {"]
        self.count = 0

    def next_id(self):
        self.count += 1
        return f"node{self.count}"

    def add_node(self, label):
        label = label.replace('"', '\\"')  # escapa aspas
        node_id = self.next_id()
        self.result.append(f'{node_id} [label="{label}"];')
        return node_id


    def visitChildren(self, node):
        parent_id = self.add_node(type(node).__name__)
        for i in range(node.getChildCount()):
            child = node.getChild(i)
            if child.getChildCount() == 0:
                child_id = self.add_node(child.getText())
            else:
                child_id = self.visit(child)
            self.result.append(f"{parent_id} -> {child_id};")
        return parent_id

    def get_dot(self):
        self.result.append("}")
        return "\n".join(self.result)
