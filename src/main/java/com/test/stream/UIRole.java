package com.test.stream;

/**
 * Represents application or UI specific role model, which is not similar to its corresponding DB model.
 * @Author bhushank
 */
public class UIRole {
    private Long id;
    private Long creationTime;
    private String uiRoleName; // transformed

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    public String getUiRoleName() {
        return uiRoleName;
    }

    public void setUiRoleName(String uiRoleName) {
        this.uiRoleName = uiRoleName;
    }
}
