public class SmartDog extends Dog {

    private String[] command;

    public String[] getCommand() {
        return command;
    }

    public void setCommand(String[] command) {
        this.command = command;
    }

    @Override
    public void bark(){
        System.out.println("Gav-gav-gav");
    }
}

