package pl.sda.static_exercise;

public class EventsDepartment {
    public static void  sendInvitationsToTheParty(String  partyName,CompanyPerson company){
        for(int i=0;i<company.getAllPerson().length;i++){
            System.out.println(company.getAllPerson()[i].getEmail());
            }

        System.out.println("You are all invited to our event "+partyName+" !!!");

    }
}
