package br.com.aelxand.portfolioapi.enums;

public enum UserRoles {
    ADMIN("admin"),
    COMMON("common");

    private final String role;

    UserRoles(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
