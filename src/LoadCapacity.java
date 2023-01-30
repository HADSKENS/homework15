public enum LoadCapacity {
    N1(3.5,null),
    N2(12, 3.5),
    N3(12,null);
    Double rightScore;
    double leftScore;
    LoadCapacity(double leftScore, Double rightScore) {
        this.leftScore=leftScore;
        this.rightScore=rightScore;
    }

    public Double getRightScore() {
        return rightScore;
    }

    public double getLeftScore() {
        return leftScore;
    }
}
