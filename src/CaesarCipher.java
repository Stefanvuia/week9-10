public class CaesarCipher implements EncryptionAlgorithm{
    int shift;
    public CaesarCipher(int shift) {
        this.shift = shift;
    }

    @Override
    public char encrypt(char c) {
        if ('a' <= c && c <= 'z')
            return (char) (((c + shift - 'a') % (26)) + 'a');
        return c;
    }

    public char decrypt(char c) {
        if ('a' <= c && c <= 'z')
            return (char) (((c + (26 - shift) - 'a') % (26)) + 'a');
        return c;
    }
}
