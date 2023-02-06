public enum Capacity {
    SoSmall(null, 10), Small(11, 25), Average(26, 50), Large(51, 80), ExstraLarge(81, 120);

    Object capacityLeft;
    int capasityRight;

    Capacity(Object capacityLeft, int capasityRight) {
        this.capacityLeft = capacityLeft;
        this.capasityRight = capasityRight;
    }
}
