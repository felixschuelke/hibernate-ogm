/*
 * Hibernate OGM, Domain model persistence for NoSQL datastores
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.ogm.datastore.neo4j.transaction.impl;

import org.hibernate.ogm.datastore.neo4j.impl.Neo4jDatastoreProvider;
import org.hibernate.ogm.transaction.impl.ForwardingTransactionCoordinatorOwner;
import org.hibernate.resource.transaction.spi.TransactionCoordinatorOwner;

/**
 * Make sure a {@link Neo4jResourceLocalTransaction} is used
 *
 * @author Davide D'Alto
 */
public class Neo4jTransactionOwner extends ForwardingTransactionCoordinatorOwner {

	private final Neo4jDatastoreProvider provider;

	public Neo4jTransactionOwner(TransactionCoordinatorOwner delegate, Neo4jDatastoreProvider provider) {
		super( delegate );
		this.provider = provider;
	}

	public Neo4jDatastoreProvider getProvider() {
		return provider;
	}
}
