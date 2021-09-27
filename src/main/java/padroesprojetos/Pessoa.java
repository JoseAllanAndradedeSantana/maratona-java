package padroesprojetos;

public class Pessoa {

    private String firstName;
    private String latsName;
    private String userName;
    private String email;

    private Pessoa(String firstName, String latsName, String userName, String email) {
        this.firstName = firstName;
        this.latsName = latsName;
        this.userName = userName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "firstName='" + firstName + '\'' +
                ", latsName='" + latsName + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class PessoaBuilder{

        private String firstName;
        private String latsName;
        private String userName;
        private String email;

        public PessoaBuilder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public PessoaBuilder latsName(String latsName){
            this.latsName = latsName;
            return this;
        }
        public PessoaBuilder userName(String userName){
            this.userName = userName;
            return this;
        }
        public PessoaBuilder email(String email){
            this.email = email;
            return this;
        }

        public Pessoa build(){
            return new Pessoa(firstName,latsName,userName,email);
        }

    }
}
