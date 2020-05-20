package com.company.excercise6;

import java.util.List;
import java.util.Set;

public class Club {

    private Set<ClubMember> members;
    private ClubMember president;

    public Club() {
    }

    public Club(Set<ClubMember> members, ClubMember president) {
        this.members = members;
        this.president = president;
    }

    public Set<ClubMember> getMembers() {
        return members;
    }

    public void setMembers(Set<ClubMember> members) {
        this.members = members;
    }

    public ClubMember getPresident() {
        return president;
    }

    public void setPresident(ClubMember president) {
        this.president = president;
    }

    @Override
    public String toString() {
        return " Club => " +
                " members = " + members +
                ", president = " + president;
    }
}
