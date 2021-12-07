package com.company.adapter;

import com.company.adapter.AdapterUtil;
import com.company.technique.Technique;

public class TechniqueAdapter extends AdapterUtil {

    private final Technique object;

    public TechniqueAdapter(Technique technique) {
        this.object = technique;
    }

    @Override
    public String toString() {
        return object.toString();
    }
}
