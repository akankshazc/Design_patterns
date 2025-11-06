package hf_6.remoteWL;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor("Main House");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");

        remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off);
        remoteControl.setCommand(1, kitchenLight::on, kitchenLight::off);
        remoteControl.setCommand(2, garageDoor::up, garageDoor::down);
        remoteControl.setCommand(3, ceilingFan::high, ceilingFan::off);
        remoteControl.setCommand(4, tv::on, tv::off);

        Command stereoOnCD = () -> {
            stereo.on();
            stereo.setCD();
            stereo.setVolume(11);
        };
        remoteControl.setCommand(5, stereoOnCD, stereo::off);

        System.out.println(remoteControl.toString());

        // Simulate button presses
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);

        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);

        remoteControl.onButtonWasPushed(5);
        remoteControl.offButtonWasPushed(5);
    }
}
