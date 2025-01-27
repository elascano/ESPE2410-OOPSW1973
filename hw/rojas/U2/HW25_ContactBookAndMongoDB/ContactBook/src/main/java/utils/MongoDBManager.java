package utils;

import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Position;
import javax.swing.text.Segment;



public class MongoDBManager {

    private MongoClient mongoClient;
    private MongoDatabase database;

    /**
     * Constructor para conectar a MongoDB
     *
     * @param uri  URI de conexión de MongoDB
     * @param dbName Nombre de la base de datos
     */
    public MongoDBManager(String uri, String dbName) {
        try {
            mongoClient = new MongoClient(new MongoClientURI(uri));
            database = mongoClient.getDatabase(dbName);
            System.out.println("Conexión exitosa a MongoDB: " + dbName);
        } catch (Exception e) {
            System.err.println("Error al conectar a MongoDB: " + e.getMessage());
        }
    }

    /**
     * Obtiene una colección de la base de datos
     *
     * @param collectionName Nombre de la colección
     * @return MongoCollection<Document>
     */
    public MongoCollection<Document> getCollection(String collectionName) {
        return database.getCollection(collectionName);
    }

    /**
     * Inserta un documento en una colección
     *
     * @param collectionName Nombre de la colección
     * @param document Documento a insertar
     */
    public void insert(String collectionName, Document document) {
        try {
            getCollection(collectionName).insertOne(document);
            System.out.println("Documento insertado en la colección: " + collectionName);
        } catch (Exception e) {
            System.err.println("Error al insertar el documento: " + e.getMessage());
        }
    }

    /**
     * Inserta múltiples documentos en una colección
     *
     * @param collectionName Nombre de la colección
     * @param documents Lista de documentos a insertar
     */
    public void insertMany(String collectionName, List<Document> documents) {
        try {
            getCollection(collectionName).insertMany(documents);
            System.out.println("Documentos insertados en la colección: " + collectionName);
        } catch (Exception e) {
            System.err.println("Error al insertar los documentos: " + e.getMessage());
        }
    }

    /**
     * Busca documentos en una colección
     *
     * @param collectionName Nombre de la colección
     * @return Iterable<Document>
     */
    public Iterable<Document> find(String collectionName) {
        return getCollection(collectionName).find();
    }

    /**
     * Actualiza un documento en una colección
     *
     * @param collectionName Nombre de la colección
     * @param filter Filtro para buscar el documento
     * @param update Documento con los campos a actualizar
     */
    public void update(String collectionName, Document filter, Document update) {
        try {
            getCollection(collectionName).updateOne(filter, new Document("$set", update) {
                @Override
                public int getLength() {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void addDocumentListener(DocumentListener listener) {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void removeDocumentListener(DocumentListener listener) {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void addUndoableEditListener(UndoableEditListener listener) {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void removeUndoableEditListener(UndoableEditListener listener) {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public Object getProperty(Object key) {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void putProperty(Object key, Object value) {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void remove(int offs, int len) throws BadLocationException {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void insertString(int offset, String str, AttributeSet a) throws BadLocationException {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public String getText(int offset, int length) throws BadLocationException {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void getText(int offset, int length, Segment txt) throws BadLocationException {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public Position getStartPosition() {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public Position getEndPosition() {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public Position createPosition(int offs) throws BadLocationException {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public Element[] getRootElements() {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public Element getDefaultRootElement() {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void render(Runnable r) {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }
            });
            System.out.println("Documento actualizado en la colección: " + collectionName);
        } catch (Exception e) {
            System.err.println("Error al actualizar el documento: " + e.getMessage());
        }
    }

    /**
     * Elimina un documento de una colección
     *
     * @param collectionName Nombre de la colección
     * @param filter Filtro para buscar el documento a eliminar
     */
    public void delete(String collectionName, Document filter) {
        try {
            getCollection(collectionName).deleteOne(filter);
            System.out.println("Documento eliminado de la colección: " + collectionName);
        } catch (Exception e) {
            System.err.println("Error al eliminar el documento: " + e.getMessage());
        }
    }

    /**
     * Cierra la conexión con MongoDB
     */
    public void close() {
        try {
            mongoClient.close();
            System.out.println("Conexión con MongoDB cerrada.");
        } catch (Exception e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}