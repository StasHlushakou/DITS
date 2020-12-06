package by.devincubator.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roleId;
    private String role;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "UsersRole",
            joinColumns = @JoinColumn(name = "roleId"),
            inverseJoinColumns = @JoinColumn(name = "userId"))
    private Set<User> userSet;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role1 = (Role) o;
        return roleId.equals(role1.roleId) &&
                role.equals(role1.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, role);
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", role=" + role +
                '}';
    }
}
