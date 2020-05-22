package com.code.entity;

import java.util.List;

/**
 * ClassName:filterSos
 * Package:com.code.entity
 * Description:
 *
 * @Date: 2020/5/18 0018 12:36
 * @Author:YAP
 */
public class filterSos {
    private String id;
    private String prefix;
    private String field;
    private String mode;
    private String type;
    private String value;

    public List<filterSoschildren> getChildren() {
        return children;
    }

    public void setChildren(List<filterSoschildren> children) {
        this.children = children;
    }

    private List<filterSoschildren> children;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public filterSos() {
        super();
    }

    @Override
    public String toString() {
        return "filterSos{" +
                "id='" + id + '\'' +
                ", prefix='" + prefix + '\'' +
                ", field='" + field + '\'' +
                ", mode='" + mode + '\'' +
                ", type='" + type + '\'' +
                ", value='" + value + '\'' +
                ", children=" + children +
                '}';
    }

    public filterSos(String id, String prefix, String field, String mode, String type, String value, List<filterSoschildren> children) {
        this.id = id;
        this.prefix = prefix;
        this.field = field;
        this.mode = mode;
        this.type = type;
        this.value = value;
        this.children = children;
    }
}
