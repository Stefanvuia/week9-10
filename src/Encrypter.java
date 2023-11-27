public class Encrypter {
    private CharReader charReader;
    private CharWriter charWriter;
    private EncryptionAlgorithm encryptionAlgorithm;

    public Encrypter(CharReader reader, CharWriter writer, EncryptionAlgorithm algorithm){
        charReader = reader;
        charWriter = writer;
        encryptionAlgorithm = algorithm;
    }
    public void encrypt() {
        for (CharReader it = charReader; it.hasNext(); ) {
            char c = it.next();
            charWriter.write(encryptionAlgorithm.encrypt(c));
        }

    }
}
