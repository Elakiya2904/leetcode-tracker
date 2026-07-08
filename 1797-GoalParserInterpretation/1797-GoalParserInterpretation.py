# Last updated: 7/8/2026, 3:56:12 PM
class Solution:
    def interpret(self, command: str) -> str:
        return command.replace("()","o").replace("(al)","al")
        