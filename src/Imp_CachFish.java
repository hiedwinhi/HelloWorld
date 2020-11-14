public class Imp_CachFish implements I_CatchFish{
    @Override
    public void UseTools(String user, String ToolsName) {
        System.out.println(user);
        System.out.println(ToolsName);
    }
}
