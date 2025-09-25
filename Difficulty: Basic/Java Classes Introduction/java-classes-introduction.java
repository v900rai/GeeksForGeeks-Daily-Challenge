class task
{
    int l;
    int w;
    int h;
    
    public void set_length(int l)
    {
        this.l=l;
    }
    public void set_width(int w)
    {
        this.w=w;
    }
    public void set_height(int h)
    {
        this.h=h;
    }
    public void volume()
    {
        System.out.println(l*w*h);
    }
}
 