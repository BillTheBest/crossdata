/*
 * Licensed to STRATIO (C) under one or more contributor license agreements.
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership.  The STRATIO (C) licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.stratio.meta2.core.query;

import com.stratio.meta.common.metadata.structures.TableMetadata;
import com.stratio.meta2.common.data.ClusterName;
import com.stratio.meta2.common.metadata.CatalogMetadata;
import com.stratio.meta2.core.statements.MetaDataStatement;

public class MetadataInProgressQuery extends InProgressQuery {
  
  private ClusterName cluster;
  private TableMetadata tableMetaData;
  private CatalogMetadata catalogMetadata;
  
  public MetadataInProgressQuery(PlannedQuery validatedQuery) {
    super(validatedQuery);
  }

  MetadataInProgressQuery(MetadataInProgressQuery plannedQuery){
    this((PlannedQuery)plannedQuery);
  }
  
  public ClusterName getCluster() {
    return cluster;
  }
  
  public TableMetadata getTableMetaData() {
    return tableMetaData;
  }

  public CatalogMetadata getCatalogMetadata() {
    return catalogMetadata;
  }

    @Override
    public MetaDataStatement getStatement() {
        return (MetaDataStatement)statement;
    }
}