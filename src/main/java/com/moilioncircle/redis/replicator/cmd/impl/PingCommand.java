package com.moilioncircle.redis.replicator.cmd.impl;

import com.moilioncircle.redis.replicator.cmd.Command;

/**
 * Created by leon on 2/2/17.
 */
public class PingCommand implements Command {
    private final String message;

    public String getMessage() {
        return message;
    }

    public PingCommand(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "PingCommand{" +
                "message='" + message + '\'' +
                '}';
    }
}
