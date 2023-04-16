package com.xch.interview.pojo;

import java.util.Objects;

/**
 * @ClassName: module
 * @author: xiongconghui
 * @date: 2023-04-16 22:55
 **/
public class module {
    private String module_id;
    private String module_name;
    private String type_id;
    private String module_cover;

    public module() {
    }

    public module(String module_id, String module_name, String type_id, String module_cover) {
        this.module_id = module_id;
        this.module_name = module_name;
        this.type_id = type_id;
        this.module_cover = module_cover;
    }

    public String getModule_id() {
        return module_id;
    }

    public void setModule_id(String module_id) {
        this.module_id = module_id;
    }

    public String getModule_name() {
        return module_name;
    }

    public void setModule_name(String module_name) {
        this.module_name = module_name;
    }

    public String getType_id() {
        return type_id;
    }

    public void setType_id(String type_id) {
        this.type_id = type_id;
    }

    public String getModule_cover() {
        return module_cover;
    }

    public void setModule_cover(String module_cover) {
        this.module_cover = module_cover;
    }

    @Override
    public String toString() {
        return "module{" +
                "module_id='" + module_id + '\'' +
                ", module_name='" + module_name + '\'' +
                ", type_id='" + type_id + '\'' +
                ", module_cover='" + module_cover + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        module module = (module) o;
        return module_id.equals(module.module_id) &&
                module_name.equals(module.module_name) &&
                type_id.equals(module.type_id) &&
                module_cover.equals(module.module_cover);
    }

    @Override
    public int hashCode() {
        return Objects.hash(module_id, module_name, type_id, module_cover);
    }
}
