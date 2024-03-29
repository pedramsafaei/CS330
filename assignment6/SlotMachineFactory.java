public interface SlotMachineFactory {
    public Cabinet createCabinet();
    public Payment createPayment();
    public Display createDisplay();
    public GPU createGPU();
    public OS createOS();
}