public enum Body {
    Sedan("Седан"),
    Hatchback("Хэтчбэк"),
    Coup("Купэ"),
    Universal("Универсал"),
    SUV("Внедорожник"),
    Crossover("Кроссовер"),
    Pickup("Пикап"),
    Van("Фургон"),
    Minivan("Минивэн");
    private String bodyType;

    Body(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }
}