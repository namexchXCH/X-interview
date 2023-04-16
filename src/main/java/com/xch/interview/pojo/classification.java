package com.xch.interview.pojo;

import java.util.Objects;

/**
 * @ClassName: classification
 * @author: xiongconghui
 * @date: 2023-04-16 23:02
 **/
public class classification {
    private String module_id;
    private String module_name;
    private String type_id;
    private String module_cover;

    public classification() {
    }

    public classification(String module_id, String module_name, String type_id, String module_cover) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        classification that = (classification) o;
        return module_id.equals(that.module_id) &&
                module_name.equals(that.module_name) &&
                type_id.equals(that.type_id) &&
                module_cover.equals(that.module_cover);
    }

    @Override
    public int hashCode() {
        return Objects.hash(module_id, module_name, type_id, module_cover);
    }

    @Override
    public String toString() {
        return "classification{" +
                "module_id='" + module_id + '\'' +
                ", module_name='" + module_name + '\'' +
                ", type_id='" + type_id + '\'' +
                ", module_cover='" + module_cover + '\'' +
                '}';
    }
}
