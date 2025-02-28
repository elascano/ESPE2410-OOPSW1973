import tkinter as tk
from tkinter import messagebox
from tkinter import ttk
from datetime import datetime

class ContactForm(tk.Tk):
    def __init__(self):
        super().__init__()
        self.title("Contacts")
        self.geometry("600x500")
        
        # Title
        lbl_title = tk.Label(self, text="Contacts", font=("Serif", 18))
        lbl_title.pack(pady=10)
        
        # Form Fields
        frame = tk.Frame(self)
        frame.pack(pady=10)
        
        tk.Label(frame, text="ID:").grid(row=0, column=0)
        self.txt_id = tk.Entry(frame)
        self.txt_id.grid(row=0, column=1)
        
        tk.Label(frame, text="Name:").grid(row=1, column=0)
        self.txt_name = tk.Entry(frame)
        self.txt_name.grid(row=1, column=1)
        
        tk.Label(frame, text="Sex:").grid(row=2, column=0)
        self.cmb_sex = ttk.Combobox(frame, values=["male", "female"])
        self.cmb_sex.grid(row=2, column=1)
        
        tk.Label(frame, text="Gender:").grid(row=3, column=0)
        self.cmb_gender = ttk.Combobox(frame, values=["man", "woman", "gay", "lesbian", "homosexual", "pansexual", "others"])
        self.cmb_gender.grid(row=3, column=1)
        
        tk.Label(frame, text="Marital Status:").grid(row=4, column=0)
        self.cmb_marital_status = ttk.Combobox(frame, values=["married", "divorced"])
        self.cmb_marital_status.grid(row=4, column=1)
        
        tk.Label(frame, text="Favorite Sports:").grid(row=5, column=0)
        self.lst_sports = tk.Listbox(frame, selectmode=tk.MULTIPLE, height=5)
        for sport in ["Soccer", "Basket", "Baseball", "Running", "Chess", "Swimming"]:
            self.lst_sports.insert(tk.END, sport)
        self.lst_sports.grid(row=5, column=1)
        
        tk.Label(frame, text="Comments:").grid(row=6, column=0)
        self.txt_comments = tk.Text(frame, height=3, width=30)
        self.txt_comments.grid(row=6, column=1)
        
        # Buttons
        frame_buttons = tk.Frame(self)
        frame_buttons.pack(pady=10)
        
        btn_add = tk.Button(frame_buttons, text="Add", command=self.add_contact)
        btn_add.grid(row=0, column=0, padx=5)
        
        btn_find = tk.Button(frame_buttons, text="Find")
        btn_find.grid(row=0, column=1, padx=5)
        
        btn_delete = tk.Button(frame_buttons, text="Delete", state=tk.DISABLED)
        btn_delete.grid(row=0, column=2, padx=5)
        
    def add_contact(self):
        try:
            contact_id = int(self.txt_id.get())
            name = self.txt_name.get()
            sex = self.cmb_sex.get()
            gender = self.cmb_gender.get()
            marital_status = self.cmb_marital_status.get()
            favorite_sports = [self.lst_sports.get(i) for i in self.lst_sports.curselection()]
            comments = self.txt_comments.get("1.0", tk.END).strip()
            
            contact = {
                "id": contact_id,
                "name": name,
                "sex": sex,
                "gender": gender,
                "marital_status": marital_status,
                "favorite_sports": favorite_sports,
                "comments": comments,
                "date_of_birth": datetime.now().strftime("%Y-%m-%d")
            }
            
            messagebox.showinfo("Success", f"Contact saved: {contact}")
        except ValueError as e:
            messagebox.showerror("Error", "Invalid data input")
            
if __name__ == "__main__":
    app = ContactForm()
    app.mainloop()
