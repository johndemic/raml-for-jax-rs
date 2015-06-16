/*
 * Copyright 2013 (c) MuleSoft, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package org.raml.jaxrs.codegen.model;

import java.util.ArrayList;

import com.mulesoft.jaxrs.raml.annotation.model.IFieldModel;
import com.mulesoft.jaxrs.raml.annotation.model.IMethodModel;
import com.mulesoft.jaxrs.raml.annotation.model.ITypeModel;

/**
 * <p>TypeModel class.</p>
 *
 * @author kor
 * @version $Id: $Id
 */
public class TypeModel extends GenericElementModel implements ITypeModel{

	/**
	 * <p>Constructor for TypeModel.</p>
	 */
	public TypeModel() {
	}
	
	private String qualifiedName;
	
	private ArrayList<IMethodModel> methods = new ArrayList<IMethodModel>();
	private ArrayList<IFieldModel> fields = new ArrayList<IFieldModel>();
	
	/**
	 * <p>Getter for the field <code>methods</code>.</p>
	 *
	 * @return an array of {@link com.mulesoft.jaxrs.raml.annotation.model.IMethodModel} objects.
	 */
	public IMethodModel[] getMethods() {
		return methods.toArray(new IMethodModel[methods.size()]);
	}
	
	/**
	 * <p>addMethod.</p>
	 *
	 * @param method a {@link com.mulesoft.jaxrs.raml.annotation.model.IMethodModel} object.
	 */
	public void addMethod(IMethodModel method){
		methods.add(method);
	}

	
	/**
	 * <p>getFullyQualifiedName.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFullyQualifiedName() {
		return qualifiedName;
	}
	
	/**
	 * <p>setFullyQualifiedName.</p>
	 *
	 * @param qualifiedName a {@link java.lang.String} object.
	 */
	public void setFullyQualifiedName(String qualifiedName) {
		this.qualifiedName = qualifiedName;
	}

	/** {@inheritDoc} */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((methods == null) ? 0 : methods.hashCode());
		result = prime * result
				+ ((qualifiedName == null) ? 0 : qualifiedName.hashCode());
		return result;
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TypeModel other = (TypeModel) obj;
		if (methods == null) {
			if (other.methods != null)
				return false;
		} else if (!methods.equals(other.methods))
			return false;
		if (qualifiedName == null) {
			if (other.qualifiedName != null)
				return false;
		} else if (!qualifiedName.equals(other.qualifiedName))
			return false;
		return true;
	}

	/** {@inheritDoc} */
	@Override
	public IFieldModel[] getFields() {
		return fields.toArray(new IFieldModel[fields.size()]);
	}

	/**
	 * <p>addField.</p>
	 *
	 * @param fieldModel a {@link com.mulesoft.jaxrs.raml.annotation.model.IFieldModel} object.
	 */
	public void addField(IFieldModel fieldModel) {
		fields.add(fieldModel);
	}
}
