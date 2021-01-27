package com.pt.command;

import com.pt.command.commands.Command;
import com.pt.command.commands.NoCommand;

import java.util.Stack;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Stack<Command> undoCommands;
    private int numOfCommands = 7;

    public RemoteControl() {
        onCommands = new Command[numOfCommands];
        offCommands = new Command[numOfCommands];
        undoCommands = new Stack<>();

        for (int i = 0; i < numOfCommands; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int slot, Command onCommand) {
        onCommands[slot] = onCommand;
    }
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPushed(int slot) {
        onCommands[slot].execute();
        undoCommands.push(onCommands[slot]);
    }

    public void offButtonPushed(int slot) {
        offCommands[slot].execute();
        undoCommands.push(offCommands[slot]);
    }

    public void undoButtonPushed() {
        if (undoCommands.empty()) return;
        undoCommands.pop().undo();
    }

    @Override
    public String toString() {
        StringBuilder objectString = new StringBuilder();
        objectString.append("------Controls------\n");
        for (int i = 0; i < numOfCommands; i++) {
            objectString.append(String.format("%-2d ", i + 1));
            objectString.append(String.format("%-25s",onCommands[i].getClass().getSimpleName()));
            objectString.append(String.format(" %-2d ", i + 1));
            objectString.append(String.format("%-25s",offCommands[i].getClass().getSimpleName()));
            objectString.append("\n");
        }
        return objectString.toString();
    }


}
