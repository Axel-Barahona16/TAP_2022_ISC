namespace mundito
{
    
    public partial class Form1 : Form
    {
        Image uno = null;
        int x,y;
        int fx ,fy;
        int img = 0;
        double vel = 0.01;
        int tiempo = 200;

        int fila = 0;

        private void timer1_Tick(object sender, EventArgs e)
        {
            img++;
            if (img > 8) img = 0;
            collisionCheck();
            lienzo.Invalidate();
        }

        private void collisionCheck()
        {
            
        }

        private void lienzo_Paint(object sender, PaintEventArgs e)
        {
            Graphics g = e.Graphics;
            g.DrawImage(uno, new Rectangle(x,y,24,52),
                fx + img*52, fy + fila*52 , 24,52, GraphicsUnit.Pixel);
        }

        private void Form1_KeyPress(object sender, KeyPressEventArgs e)
        {
            Console.WriteLine("caminar");
            int distancia = (int)(vel * tiempo);
            if (e.KeyChar == 'a')
            {
                x -= distancia;
                fila = 1;
            }
            if (e.KeyChar == 'd')
            {
                x+=distancia;
                fila = 1;
            }
        }

        public Form1()
        {
            InitializeComponent();
            uno = Image.FromFile("recursos\\crash.png");
            x = y = 0;
            fx = fy = 0;
            tick.Enabled = true;
            tick.Start();
        }

        private void lienzo_Click(object sender, EventArgs e)
        {

        }
    }
}