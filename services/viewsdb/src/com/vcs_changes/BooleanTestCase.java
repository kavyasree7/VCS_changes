/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.vcs_changes;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * BooleanTestCase generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`BooleanTestCase`")
public class BooleanTestCase implements Serializable {

    private Integer id;
    private String stringColumn;
    private Boolean booleanColumn;

    @Id
    @SequenceGenerator(name = "generator", sequenceName = "\"BooleanTestCase_ID_seq\"" , schema = "public", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator")
    @Column(name = "`ID`", nullable = false, scale = 0, precision = 10)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "`String Column`", nullable = true, length = 255)
    public String getStringColumn() {
        return this.stringColumn;
    }

    public void setStringColumn(String stringColumn) {
        this.stringColumn = stringColumn;
    }

    @Column(name = "`Boolean Column`", nullable = true)
    public Boolean getBooleanColumn() {
        return this.booleanColumn;
    }

    public void setBooleanColumn(Boolean booleanColumn) {
        this.booleanColumn = booleanColumn;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BooleanTestCase)) return false;
        final BooleanTestCase booleanTestCase = (BooleanTestCase) o;
        return Objects.equals(getId(), booleanTestCase.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}

