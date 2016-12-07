package datos;

import org.apache.jena.query.ParameterizedSparqlString;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.ResultSetFactory;
import org.apache.jena.query.ResultSetFormatter;
import org.apache.jena.rdf.model.Literal;
import org.apache.jena.rdf.model.ResourceFactory;

public class linkedOpenData {
	
    public static void main(String[] args) {
        org.apache.jena.query.ParameterizedSparqlString qs = new ParameterizedSparqlString( "" +
                "prefix rdfs:    <http://www.w3.org/2000/01/rdf-schema#>\n" +
                "\n" +
                "select ?resource where {\n" +
                "  ?resource rdfs:label ?label\n" +
                "}" );

        Literal london = ResourceFactory.createLangLiteral( "Londres", "es" );
        qs.setParam( "label", london );

        System.out.println( qs );

        QueryExecution exec = QueryExecutionFactory.sparqlService( "http://dbpedia.org/sparql", qs.asQuery() );

        ResultSet results = ResultSetFactory.copyResults( exec.execSelect() );

        while ( results.hasNext() ) {

            System.out.println( results.next().get( "resource" ));
        }

        ResultSetFormatter.out( results );
    }
}