import tkinter as tk
from tkinter import messagebox
from tkinter import ttk
from controllers.contact_controller import ContactController
from models.contact import Contact

class FrmContact(tk.Tk):
    def __init__(self):
        super().__init__()
        
        self.title("Contacts")
        self.geometry("600x500")
        
        self.contact_controller = ContactController()
        
        # Create the form elements
        self.create_widgets()
        
    def create_widgets(self):
        # Title
        self.title_frame = tk.Frame(self)
        self.title_frame.pack(fill=tk.X)
        
        self.title_label = tk.Label(self.title_frame, text="Contacts", font=("Arial", 18))
        self.title_label.pack(pady=20)

        # Body (Form)
        self.body_frame = tk.Frame(self)
        self.body_frame.pack(fill=tk.X)

        self.create_form()

        # Footer
        self.footer_frame = tk.Frame(self)
        self.footer_frame.pack(fill=tk.X, pady=20)

    def create_form(self):
        # ID
        self.label_id = tk.Label(self.body_frame, text="ID:")
        self.label_id.grid(row=0, column=0, padx=10, pady=5)
        self.entry_id = tk.Entry(self.body_frame)
        self.entry_id.grid(row=0, column=1, padx=10, pady=5)

        # Name
        self.label_name = tk.Label(self.body_frame, text="Name:")
        self.label_name.grid(row=1, column=0, padx=10, pady=5)
        self.entry_name = tk.Entry(self.body_frame)
        self.entry_name.grid(row=1, column=1, padx=10, pady=5)

        # Sex
        self.label_sex = tk.Label(self.body_frame, text="Sex:")
        self.label_sex.grid(row=2, column=0, padx=10, pady=5)
        self.combo_sex = ttk.Combobox(self.body_frame, values=["male", "female"])
        self.combo_sex.grid(row=2, column=1, padx=10, pady=5)

        # Gender
        self.label_gender = tk.Label(self.body_frame, text="Gender:")
        self.label_gender.grid(row=3, column=0, padx=10, pady=5)
        self.combo_gender = ttk.Combobox(self.body_frame, values=["man", "woman", "gay", "lesbian", "homosexual", "pansexual", "trans"])
        self.combo_gender.grid(row=3, column=1, padx=10, pady=5)

        # Marital Status
        self.label_marital_status = tk.Label(self.body_frame, text="Marital Status:")
        self.label_marital_status.grid(row=4, column=0, padx=10, pady=5)
        self.combo_marital_status = ttk.Combobox(self.body_frame, values=["married", "single", "divorced", "widow"])
        self.combo_marital_status.grid(row=4, column=1, padx=10, pady=5)

        # Favorite Sport
        self.label_favorite_sport = tk.Label(self.body_frame, text="Favorite Sport:")
        self.label_favorite_sport.grid(row=5, column=0, padx=10, pady=5)
        self.listbox_sport = tk.Listbox(self.body_frame, height=5)
        sports = ["Soccer", "Basketball", "Baseball", "Running", "Chess", "Swimming"]
        for sport in sports:
            self.listbox_sport.insert(tk.END, sport)
        self.listbox_sport.grid(row=5, column=1, padx=10, pady=5)

        # Comments
        self.label_comments = tk.Label(self.body_frame, text="Comments:")
        self.label_comments.grid(row=6, column=0, padx=10, pady=5)
        self.text_comments = tk.Text(self.body_frame, height=4, width=40)
        self.text_comments.grid(row=6, column=1, padx=10, pady=5)

        # Buttons
        self.btn_add = tk.Button(self.body_frame, text="Add", command=self.add_contact)
        self.btn_add.grid(row=7, column=0, padx=10, pady=5)

        self.btn_find = tk.Button(self.body_frame, text="Find", command=self.find_contact)
        self.btn_find.grid(row=7, column=1, padx=10, pady=5)

    def add_contact(self):
        contact_id = self.entry_id.get()
        name = self.entry_name.get()
        sex = self.combo_sex.get()
        gender = self.combo_gender.get()
        marital_status = self.combo_marital_status.get()
        favorite_sport = self.listbox_sport.get(tk.ACTIVE)
        comments = self.text_comments.get("1.0", tk.END)

        if contact_id and name and sex and gender and marital_status and favorite_sport:
            contact = Contact(contact_id, name, sex, gender, marital_status, favorite_sport, comments)
            self.contact_controller.add_contact(contact)
            messagebox.showinfo("Success", "Contact added successfully!")
        else:
            messagebox.showerror("Error", "Please fill out all fields.")

    def find_contact(self):
        contact_id = self.entry_id.get()
        contact = self.contact_controller.find_contact(contact_id)

        if contact:
            self.entry_name.delete(0, tk.END)
            self.entry_name.insert(0, contact.name)
            self.combo_sex.set(contact.sex)
            self.combo_gender.set(contact.gender)
           
