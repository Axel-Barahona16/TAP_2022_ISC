using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace MiMundo
{
    public partial class Form1 : Form
    {
        Image uno = null;
        int x, y;
        int fx, fy;
        int img = 0;
        double vel = 0.01;
        int tiempo = 200;
        int fila=0;
        public Form1()
        {
            InitializeComponent();
            uno = Image.FromFile("Recurso\\yoshi.png");
            x = y = 0;
            fx = fy = 0;
            tick.Enabled = true;
            tick.Start();
        }

        private void Lienzo_Paint(object sender, PaintEventArgs e)
        {
            Graphics g = e.Graphics;
            g.DrawImage(uno, new Rectangle(x, y, 40, 40), fx+img*40,fy+fila*40,40,40, GraphicsUnit.Pixel);
        }

        private void Form1_KeyUp(object sender, KeyEventArgs e)
        {
            fila = 0;
        }

        private void Form1_KeyPress(object sender, KeyPressEventArgs e)
        {
            int distancia = (int)(vel * tiempo);
            if (e.KeyChar == 'a')
            {
                x -=distancia;
                fila = 1;
            }
            if (e.KeyChar == 'd')
            {
                x += distancia;
                fila = 1;
            }
        }

        private void tick_Tick(object sender, EventArgs e)
        {
            img++;
            if (img > 3) img = 0;
            CollisionCheck();
            Lienzo.Invalidate();

        }

        private void CollisionCheck()
        {
           
        }
    }
}
