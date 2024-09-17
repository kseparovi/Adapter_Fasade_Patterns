package FirstTask;


public class WriterAdapter implements WriterInt {

    private OldNovelist oNov;

    public WriterAdapter(OldNovelist on) {
        oNov = on;
    }

    @Override
    public void writeNovel(int novelType) {
        if(novelType == (int) novelType) {
            oNov.writeSFNovel();
        } else {
            System.out.println("This can work only for integer as input argument!!!");
        }

    }

}
