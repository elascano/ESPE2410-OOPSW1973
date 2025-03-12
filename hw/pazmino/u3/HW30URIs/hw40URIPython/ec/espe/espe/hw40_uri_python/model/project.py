from pymongo import MongoClient

class Project:
    def __init__(self, project_id, project_title, project_description, start_date, closing_date,
                 start_quote, operational_status, quote_status, paid, invoiced, is_public):
        self.project_id = project_id
        self.project_title = project_title
        self.project_description = project_description
        self.start_date = start_date
        self.closing_date = closing_date
        self.start_quote = start_quote
        self.operational_status = operational_status
        self.quote_status = quote_status
        self.paid = paid
        self.invoiced = invoiced
        self.is_public = is_public

    def to_document(self):
        return {
            "projectId": self.project_id,
            "projectTitle": self.project_title,
            "projectDescription": self.project_description,
            "startDate": self.start_date,
            "closingDate": self.closing_date,
            "startquote": self.start_quote,
            "operationalStatus": self.operational_status,
            "quoteStatus": self.quote_status,
            "paid": self.paid,
            "invoiced": self.invoiced,
            "isPublic": self.is_public
        }
