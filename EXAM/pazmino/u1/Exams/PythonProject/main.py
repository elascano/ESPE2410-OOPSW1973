


Name_of_Status = Status("name", "status_id", "description")

print(type(Name_Status))

print(Name_of_Status.name, Name_of_Status.status_id, Name_of_Status.description)

class Notification:
    def __init__(self, notification_id, title, status, message):
        self.notification_id = notification_id
        self.title = title
        self.status = status
        self.message = message

Name_of_Notification = Notification("notification_id", "title", "status", "message")

print(type(Name_of_Notification))

print(Name_of_Notification.notification_id, Name_of_Notifications.title, Name_of_Notification.status, Name_of_Notification.message)

class Database:
    def __init__(self, username, password, database_name):
        self.username = username
        self.password = password
        self.database_name = database_name
        self.is_connected = False
        