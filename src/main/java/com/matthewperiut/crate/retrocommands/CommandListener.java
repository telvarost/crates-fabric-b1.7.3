package com.matthewperiut.crate.retrocommands;

import com.matthewperiut.retrocommands.api.CommandRegistry;

public class CommandListener {
    public static void addCrateCommand() {
        CommandRegistry.add(new CrateCommand());
    }
}
