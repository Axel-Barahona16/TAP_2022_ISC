namespace mundito
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.lienzo = new System.Windows.Forms.PictureBox();
            this.tick = new System.Windows.Forms.Timer(this.components);
            ((System.ComponentModel.ISupportInitialize)(this.lienzo)).BeginInit();
            this.SuspendLayout();
            // 
            // lienzo
            // 
            this.lienzo.Location = new System.Drawing.Point(12, 12);
            this.lienzo.Name = "lienzo";
            this.lienzo.Size = new System.Drawing.Size(739, 266);
            this.lienzo.TabIndex = 0;
            this.lienzo.TabStop = false;
            this.lienzo.Click += new System.EventHandler(this.lienzo_Click);
            this.lienzo.Paint += new System.Windows.Forms.PaintEventHandler(this.lienzo_Paint);
            // 
            // tick
            // 
            this.tick.Interval = 1000;
            this.tick.Tick += new System.EventHandler(this.timer1_Tick);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(787, 335);
            this.Controls.Add(this.lienzo);
            this.Name = "Form1";
            this.Text = "Form1";
            this.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.Form1_KeyPress);
            ((System.ComponentModel.ISupportInitialize)(this.lienzo)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private PictureBox lienzo;
        private System.Windows.Forms.Timer tick;
    }
}