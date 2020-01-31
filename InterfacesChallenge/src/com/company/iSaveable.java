package com.company;

import java.util.List;

public interface iSaveable {
    List write();
    void read(List<String> savedValue);
}

