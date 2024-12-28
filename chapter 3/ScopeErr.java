class ScopeErr {
    public static void main(String[] args) {
        int bar = 1;
        {
            // int bar = 2;
            // создав новую область видимости получим ошибку на этапе компиляции, bar уже определён.
        }
    }
}
