public class Team {
    Member member;
    public Team(Member member) {
        this.member = member;
    }

    // Here's our main method
    public static void main(String[] args) {
        Member myMember = new Member("VIRAJ","Supporter", 10, 1);
        Team myTeam = new Team(myMember);
        System.out.println(myTeam.member.getName());
        System.out.println(myTeam.member.getType());
        System.out.println(myTeam.member.getLevel());
        System.out.println(myTeam.member.getRank());
    }
}

class Member {
    private String Name;
    private String Type;
    private int Level;
    private int Rank;

    public Member(String Name, String Type, int Level, int Rank) {
        this.Name = Name;
        this.Type = Type;
        this.Level = Level;
        this.Rank = Rank;
    }

    /*Let's define out getter functions here */
    public String getName () { // What is your name?
        return this.Name; // my name is...
    }

    public String getType() { // what is your type?
        return this.Type; // my type is ...
    }

    public int getLevel() { // what is your level?
        return this.Level; // my level is ...
    }

    public int getRank() { // what is your rank?
        return this.Rank; // my rank is
    }
}