/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: https://www.jooq.org/legal/licensing
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq.codegen.gradle;

import java.util.*;

//import groovy.lang.Closure;
//import groovy.lang.DelegatesTo;
import org.gradle.api.Action;
import org.jooq.meta.jaxb.*;

/**
 * Extensions for the jOOQ-meta types, to enable groovy DSL usage.
 */
@SuppressWarnings("ALL")
public class MetaExtensions {


    public static class ConfigurationExtension extends Configuration {
        public void jdbc(Action<? super JdbcExtension> action) {
            JdbcExtension o = new JdbcExtension();
            action.execute(o);
            setJdbc(o);
        }
        /*
        public void generator(@DelegatesTo(strategy = Closure.DELEGATE_FIRST, value = GeneratorExtension.class) Closure<?> closure) {
            GeneratorExtension o = new GeneratorExtension();
            closure = (Closure<?>) closure.clone();
            closure.setResolveStrategy(Closure.DELEGATE_FIRST);
            closure.setDelegate(o);
            closure.call(o);
            setGenerator(o);
        }
         */
        public void generator(Action<? super GeneratorExtension> action) {
            GeneratorExtension o = new GeneratorExtension() {};
            action.execute(o);
            setGenerator(o);
        }
    }

    public static class JdbcExtension extends Jdbc {

        public void properties(Action<? super PropertyListExtension> action) {
            PropertyListExtension l = new PropertyListExtension();
            action.execute(l);
            setProperties(l);
        }
    }

    public static class PropertyExtension extends Property {
    }

    public static abstract class GeneratorExtension extends Generator {
        public void strategy(Action<? super StrategyExtension> action) {
            StrategyExtension o = new StrategyExtension();
            action.execute(o);
            setStrategy(o);
        }
        /*
        public void database(@DelegatesTo(strategy = Closure.DELEGATE_FIRST, value = DatabaseExtension.class) Closure<?> closure) {
            DatabaseExtension o = new DatabaseExtension();
            closure = (Closure<?>) closure.clone();
            closure.setResolveStrategy(Closure.DELEGATE_FIRST);
            closure.setDelegate(o);
            closure.call(o);
            setDatabase(o);
        }
         */
        public void database(Action<? super DatabaseExtension> action) {
            DatabaseExtension o = new DatabaseExtension();
            action.execute(o);
            setDatabase(o);
        }
        public void generate(Action<? super GenerateExtension> action) {
            GenerateExtension o = new GenerateExtension();
            action.execute(o);
            setGenerate(o);
        }
        /*
        public void target(@DelegatesTo(strategy = Closure.DELEGATE_FIRST, value = TargetExtension.class) Closure<?> closure) {
            TargetExtension o = new TargetExtension();
            closure = (Closure<?>) closure.clone();
            closure.setResolveStrategy(Closure.DELEGATE_FIRST);
            closure.setDelegate(o);
            closure.call(o);
            setTarget(o);
        }
         */
        public void target(Action<? super TargetExtension> action) {
            TargetExtension o = new TargetExtension();
            action.execute(o);
            setTarget(o);
        }
    }

    public static class StrategyExtension extends Strategy {
        public void matchers(Action<? super MatchersExtension> action) {
            MatchersExtension o = new MatchersExtension();
            action.execute(o);
            setMatchers(o);
        }
    }

    public static class MatchersExtension extends Matchers {

        public void catalogs(Action<? super MatchersCatalogTypeListExtension> action) {
            MatchersCatalogTypeListExtension l = new MatchersCatalogTypeListExtension();
            action.execute(l);
            setCatalogs(l);
        }

        public void schemas(Action<? super MatchersSchemaTypeListExtension> action) {
            MatchersSchemaTypeListExtension l = new MatchersSchemaTypeListExtension();
            action.execute(l);
            setSchemas(l);
        }

        public void tables(Action<? super MatchersTableTypeListExtension> action) {
            MatchersTableTypeListExtension l = new MatchersTableTypeListExtension();
            action.execute(l);
            setTables(l);
        }

        public void indexes(Action<? super MatchersIndexTypeListExtension> action) {
            MatchersIndexTypeListExtension l = new MatchersIndexTypeListExtension();
            action.execute(l);
            setIndexes(l);
        }

        public void primaryKeys(Action<? super MatchersPrimaryKeyTypeListExtension> action) {
            MatchersPrimaryKeyTypeListExtension l = new MatchersPrimaryKeyTypeListExtension();
            action.execute(l);
            setPrimaryKeys(l);
        }

        public void uniqueKeys(Action<? super MatchersUniqueKeyTypeListExtension> action) {
            MatchersUniqueKeyTypeListExtension l = new MatchersUniqueKeyTypeListExtension();
            action.execute(l);
            setUniqueKeys(l);
        }

        public void foreignKeys(Action<? super MatchersForeignKeyTypeListExtension> action) {
            MatchersForeignKeyTypeListExtension l = new MatchersForeignKeyTypeListExtension();
            action.execute(l);
            setForeignKeys(l);
        }

        public void fields(Action<? super MatchersFieldTypeListExtension> action) {
            MatchersFieldTypeListExtension l = new MatchersFieldTypeListExtension();
            action.execute(l);
            setFields(l);
        }

        public void routines(Action<? super MatchersRoutineTypeListExtension> action) {
            MatchersRoutineTypeListExtension l = new MatchersRoutineTypeListExtension();
            action.execute(l);
            setRoutines(l);
        }

        public void sequences(Action<? super MatchersSequenceTypeListExtension> action) {
            MatchersSequenceTypeListExtension l = new MatchersSequenceTypeListExtension();
            action.execute(l);
            setSequences(l);
        }

        public void enums(Action<? super MatchersEnumTypeListExtension> action) {
            MatchersEnumTypeListExtension l = new MatchersEnumTypeListExtension();
            action.execute(l);
            setEnums(l);
        }

        public void embeddables(Action<? super MatchersEmbeddableTypeListExtension> action) {
            MatchersEmbeddableTypeListExtension l = new MatchersEmbeddableTypeListExtension();
            action.execute(l);
            setEmbeddables(l);
        }

        public void udts(Action<? super MatchersUDTTypeListExtension> action) {
            MatchersUDTTypeListExtension l = new MatchersUDTTypeListExtension();
            action.execute(l);
            setUdts(l);
        }

        public void attributes(Action<? super MatchersAttributeTypeListExtension> action) {
            MatchersAttributeTypeListExtension l = new MatchersAttributeTypeListExtension();
            action.execute(l);
            setAttributes(l);
        }
    }

    public static class MatchersCatalogTypeExtension extends MatchersCatalogType {
        public void catalogClass(Action<? super MatcherRuleExtension> action) {
            MatcherRuleExtension o = new MatcherRuleExtension();
            action.execute(o);
            setCatalogClass(o);
        }
    }

    public static class MatcherRuleExtension extends MatcherRule {
    }

    public static class MatchersSchemaTypeExtension extends MatchersSchemaType {
    }

    public static class MatchersTableTypeExtension extends MatchersTableType {
    }

    public static class MatchersIndexTypeExtension extends MatchersIndexType {
    }

    public static class MatchersPrimaryKeyTypeExtension extends MatchersPrimaryKeyType {
    }

    public static class MatchersUniqueKeyTypeExtension extends MatchersUniqueKeyType {
    }

    public static class MatchersForeignKeyTypeExtension extends MatchersForeignKeyType {
    }

    public static class MatchersFieldTypeExtension extends MatchersFieldType {
    }

    public static class MatchersRoutineTypeExtension extends MatchersRoutineType {
    }

    public static class MatchersSequenceTypeExtension extends MatchersSequenceType {
    }

    public static class MatchersEnumTypeExtension extends MatchersEnumType {
    }

    public static class MatchersEmbeddableTypeExtension extends MatchersEmbeddableType {
    }

    public static class MatchersUDTTypeExtension extends MatchersUDTType {
    }

    public static class MatchersAttributeTypeExtension extends MatchersAttributeType {
    }

    public static class DatabaseExtension extends Database {
        public void syntheticObjects(Action<? super SyntheticObjectsTypeExtension> action) {
            SyntheticObjectsTypeExtension o = new SyntheticObjectsTypeExtension();
            action.execute(o);
            setSyntheticObjects(o);
        }
        /*
        public void properties(@DelegatesTo(strategy = Closure.DELEGATE_FIRST, value = PropertyListExtension.class) Closure<?> closure) {
            PropertyListExtension l = new PropertyListExtension();
            closure = (Closure<?>) closure.clone();
            closure.setResolveStrategy(Closure.DELEGATE_FIRST);
            closure.setDelegate(l);
            closure.call(l);
            setProperties(l);
        }
         */

        public void properties(Action<? super PropertyListExtension> action) {
            PropertyListExtension l = new PropertyListExtension();
            action.execute(l);
            setProperties(l);
        }

        public void comments(Action<? super CommentTypeListExtension> action) {
            CommentTypeListExtension l = new CommentTypeListExtension();
            action.execute(l);
            setComments(l);
        }

        public void catalogs(Action<? super CatalogMappingTypeListExtension> action) {
            CatalogMappingTypeListExtension l = new CatalogMappingTypeListExtension();
            action.execute(l);
            setCatalogs(l);
        }

        public void schemata(Action<? super SchemaMappingTypeListExtension> action) {
            SchemaMappingTypeListExtension l = new SchemaMappingTypeListExtension();
            action.execute(l);
            setSchemata(l);
        }

        public void embeddables(Action<? super EmbeddableDefinitionTypeListExtension> action) {
            EmbeddableDefinitionTypeListExtension l = new EmbeddableDefinitionTypeListExtension();
            action.execute(l);
            setEmbeddables(l);
        }

        public void customTypes(Action<? super CustomTypeListExtension> action) {
            CustomTypeListExtension l = new CustomTypeListExtension();
            action.execute(l);
            setCustomTypes(l);
        }

        public void enumTypes(Action<? super EnumTypeListExtension> action) {
            EnumTypeListExtension l = new EnumTypeListExtension();
            action.execute(l);
            setEnumTypes(l);
        }

        public void forcedTypes(Action<? super ForcedTypeListExtension> action) {
            ForcedTypeListExtension l = new ForcedTypeListExtension();
            action.execute(l);
            setForcedTypes(l);
        }
    }

    public static class SyntheticObjectsTypeExtension extends SyntheticObjectsType {

        public void readonlyColumns(Action<? super SyntheticReadonlyColumnTypeListExtension> action) {
            SyntheticReadonlyColumnTypeListExtension l = new SyntheticReadonlyColumnTypeListExtension();
            action.execute(l);
            setReadonlyColumns(l);
        }

        public void readonlyRowids(Action<? super SyntheticReadonlyRowidTypeListExtension> action) {
            SyntheticReadonlyRowidTypeListExtension l = new SyntheticReadonlyRowidTypeListExtension();
            action.execute(l);
            setReadonlyRowids(l);
        }

        public void columns(Action<? super SyntheticColumnTypeListExtension> action) {
            SyntheticColumnTypeListExtension l = new SyntheticColumnTypeListExtension();
            action.execute(l);
            setColumns(l);
        }

        public void identities(Action<? super SyntheticIdentityTypeListExtension> action) {
            SyntheticIdentityTypeListExtension l = new SyntheticIdentityTypeListExtension();
            action.execute(l);
            setIdentities(l);
        }

        public void enums(Action<? super SyntheticEnumTypeListExtension> action) {
            SyntheticEnumTypeListExtension l = new SyntheticEnumTypeListExtension();
            action.execute(l);
            setEnums(l);
        }

        public void primaryKeys(Action<? super SyntheticPrimaryKeyTypeListExtension> action) {
            SyntheticPrimaryKeyTypeListExtension l = new SyntheticPrimaryKeyTypeListExtension();
            action.execute(l);
            setPrimaryKeys(l);
        }

        public void uniqueKeys(Action<? super SyntheticUniqueKeyTypeListExtension> action) {
            SyntheticUniqueKeyTypeListExtension l = new SyntheticUniqueKeyTypeListExtension();
            action.execute(l);
            setUniqueKeys(l);
        }

        public void foreignKeys(Action<? super SyntheticForeignKeyTypeListExtension> action) {
            SyntheticForeignKeyTypeListExtension l = new SyntheticForeignKeyTypeListExtension();
            action.execute(l);
            setForeignKeys(l);
        }

        public void views(Action<? super SyntheticViewTypeListExtension> action) {
            SyntheticViewTypeListExtension l = new SyntheticViewTypeListExtension();
            action.execute(l);
            setViews(l);
        }

        public void daos(Action<? super SyntheticDaoTypeListExtension> action) {
            SyntheticDaoTypeListExtension l = new SyntheticDaoTypeListExtension();
            action.execute(l);
            setDaos(l);
        }
    }

    public static class SyntheticReadonlyColumnTypeExtension extends SyntheticReadonlyColumnType {
    }

    public static class SyntheticReadonlyRowidTypeExtension extends SyntheticReadonlyRowidType {
    }

    public static class SyntheticColumnTypeExtension extends SyntheticColumnType {
    }

    public static class SyntheticIdentityTypeExtension extends SyntheticIdentityType {
    }

    public static class SyntheticEnumTypeExtension extends SyntheticEnumType {
    }

    public static class SyntheticPrimaryKeyTypeExtension extends SyntheticPrimaryKeyType {
    }

    public static class SyntheticUniqueKeyTypeExtension extends SyntheticUniqueKeyType {
    }

    public static class SyntheticForeignKeyTypeExtension extends SyntheticForeignKeyType {
    }

    public static class SyntheticViewTypeExtension extends SyntheticViewType {
    }

    public static class SyntheticDaoTypeExtension extends SyntheticDaoType {

        public void methods(Action<? super SyntheticDaoMethodTypeListExtension> action) {
            SyntheticDaoMethodTypeListExtension l = new SyntheticDaoMethodTypeListExtension();
            action.execute(l);
            setMethods(l);
        }
    }

    public static class SyntheticDaoMethodTypeExtension extends SyntheticDaoMethodType {
    }

    public static class CommentTypeExtension extends CommentType {
    }

    public static class CatalogMappingTypeExtension extends CatalogMappingType {

        public void schemata(Action<? super SchemaMappingTypeListExtension> action) {
            SchemaMappingTypeListExtension l = new SchemaMappingTypeListExtension();
            action.execute(l);
            setSchemata(l);
        }
    }

    public static class SchemaMappingTypeExtension extends SchemaMappingType {
    }

    public static class EmbeddableDefinitionTypeExtension extends EmbeddableDefinitionType {

        public void fields(Action<? super EmbeddableFieldListExtension> action) {
            EmbeddableFieldListExtension l = new EmbeddableFieldListExtension();
            action.execute(l);
            setFields(l);
        }
    }

    public static class EmbeddableFieldExtension extends EmbeddableField {
    }

    public static class CustomTypeExtension extends CustomType {
        public void lambdaConverter(Action<? super LambdaConverterExtension> action) {
            LambdaConverterExtension o = new LambdaConverterExtension();
            action.execute(o);
            setLambdaConverter(o);
        }
    }

    public static class LambdaConverterExtension extends LambdaConverter {
    }

    public static class EnumTypeExtension extends EnumType {
    }

    public static class ForcedTypeExtension extends ForcedType {
    }

    public static class GenerateExtension extends Generate {
    }

    public static class TargetExtension extends Target {
    }

    public static class PropertyListExtension extends ArrayList<Property> {
        public void property(Action<? super PropertyExtension> action) {
            PropertyExtension o = new PropertyExtension();
            action.execute(o);
            add(o);
        }
    }

    public static class MatchersCatalogTypeListExtension extends ArrayList<MatchersCatalogType> {
        public void catalog(Action<? super MatchersCatalogTypeExtension> action) {
            MatchersCatalogTypeExtension o = new MatchersCatalogTypeExtension();
            action.execute(o);
            add(o);
        }
    }

    public static class MatchersSchemaTypeListExtension extends ArrayList<MatchersSchemaType> {
        public void schema(Action<? super MatchersSchemaTypeExtension> action) {
            MatchersSchemaTypeExtension o = new MatchersSchemaTypeExtension();
            action.execute(o);
            add(o);
        }
    }

    public static class MatchersTableTypeListExtension extends ArrayList<MatchersTableType> {
        public void table(Action<? super MatchersTableTypeExtension> action) {
            MatchersTableTypeExtension o = new MatchersTableTypeExtension();
            action.execute(o);
            add(o);
        }
    }

    public static class MatchersIndexTypeListExtension extends ArrayList<MatchersIndexType> {
        public void index(Action<? super MatchersIndexTypeExtension> action) {
            MatchersIndexTypeExtension o = new MatchersIndexTypeExtension();
            action.execute(o);
            add(o);
        }
    }

    public static class MatchersPrimaryKeyTypeListExtension extends ArrayList<MatchersPrimaryKeyType> {
        public void primaryKey(Action<? super MatchersPrimaryKeyTypeExtension> action) {
            MatchersPrimaryKeyTypeExtension o = new MatchersPrimaryKeyTypeExtension();
            action.execute(o);
            add(o);
        }
    }

    public static class MatchersUniqueKeyTypeListExtension extends ArrayList<MatchersUniqueKeyType> {
        public void uniqueKey(Action<? super MatchersUniqueKeyTypeExtension> action) {
            MatchersUniqueKeyTypeExtension o = new MatchersUniqueKeyTypeExtension();
            action.execute(o);
            add(o);
        }
    }

    public static class MatchersForeignKeyTypeListExtension extends ArrayList<MatchersForeignKeyType> {
        public void foreignKey(Action<? super MatchersForeignKeyTypeExtension> action) {
            MatchersForeignKeyTypeExtension o = new MatchersForeignKeyTypeExtension();
            action.execute(o);
            add(o);
        }
    }

    public static class MatchersFieldTypeListExtension extends ArrayList<MatchersFieldType> {
        public void field(Action<? super MatchersFieldTypeExtension> action) {
            MatchersFieldTypeExtension o = new MatchersFieldTypeExtension();
            action.execute(o);
            add(o);
        }
    }

    public static class MatchersRoutineTypeListExtension extends ArrayList<MatchersRoutineType> {
        public void routine(Action<? super MatchersRoutineTypeExtension> action) {
            MatchersRoutineTypeExtension o = new MatchersRoutineTypeExtension();
            action.execute(o);
            add(o);
        }
    }

    public static class MatchersSequenceTypeListExtension extends ArrayList<MatchersSequenceType> {
        public void sequence(Action<? super MatchersSequenceTypeExtension> action) {
            MatchersSequenceTypeExtension o = new MatchersSequenceTypeExtension();
            action.execute(o);
            add(o);
        }
    }

    public static class MatchersEnumTypeListExtension extends ArrayList<MatchersEnumType> {
        public void enum_(Action<? super MatchersEnumTypeExtension> action) {
            MatchersEnumTypeExtension o = new MatchersEnumTypeExtension();
            action.execute(o);
            add(o);
        }
    }

    public static class MatchersEmbeddableTypeListExtension extends ArrayList<MatchersEmbeddableType> {
        public void embeddable(Action<? super MatchersEmbeddableTypeExtension> action) {
            MatchersEmbeddableTypeExtension o = new MatchersEmbeddableTypeExtension();
            action.execute(o);
            add(o);
        }
    }

    public static class MatchersUDTTypeListExtension extends ArrayList<MatchersUDTType> {
        public void udt(Action<? super MatchersUDTTypeExtension> action) {
            MatchersUDTTypeExtension o = new MatchersUDTTypeExtension();
            action.execute(o);
            add(o);
        }
    }

    public static class MatchersAttributeTypeListExtension extends ArrayList<MatchersAttributeType> {
        public void attribute(Action<? super MatchersAttributeTypeExtension> action) {
            MatchersAttributeTypeExtension o = new MatchersAttributeTypeExtension();
            action.execute(o);
            add(o);
        }
    }

    public static class CommentTypeListExtension extends ArrayList<CommentType> {
        public void comment(Action<? super CommentTypeExtension> action) {
            CommentTypeExtension o = new CommentTypeExtension();
            action.execute(o);
            add(o);
        }
    }

    public static class CatalogMappingTypeListExtension extends ArrayList<CatalogMappingType> {
        public void catalog(Action<? super CatalogMappingTypeExtension> action) {
            CatalogMappingTypeExtension o = new CatalogMappingTypeExtension();
            action.execute(o);
            add(o);
        }
    }

    public static class SchemaMappingTypeListExtension extends ArrayList<SchemaMappingType> {
        public void schema(Action<? super SchemaMappingTypeExtension> action) {
            SchemaMappingTypeExtension o = new SchemaMappingTypeExtension();
            action.execute(o);
            add(o);
        }
    }

    public static class EmbeddableDefinitionTypeListExtension extends ArrayList<EmbeddableDefinitionType> {
        public void embeddable(Action<? super EmbeddableDefinitionTypeExtension> action) {
            EmbeddableDefinitionTypeExtension o = new EmbeddableDefinitionTypeExtension();
            action.execute(o);
            add(o);
        }
    }

    @SuppressWarnings("ALL")
    public static class CustomTypeListExtension extends ArrayList<CustomType> {
        public void customType(Action<? super CustomTypeExtension> action) {
            CustomTypeExtension o = new CustomTypeExtension();
            action.execute(o);
            add(o);
        }
    }

    public static class EnumTypeListExtension extends ArrayList<EnumType> {
        public void enumType(Action<? super EnumTypeExtension> action) {
            EnumTypeExtension o = new EnumTypeExtension();
            action.execute(o);
            add(o);
        }
    }

    public static class ForcedTypeListExtension extends ArrayList<ForcedType> {
        public void forcedType(Action<? super ForcedTypeExtension> action) {
            ForcedTypeExtension o = new ForcedTypeExtension();
            action.execute(o);
            add(o);
        }
    }

    public static class SyntheticReadonlyColumnTypeListExtension extends ArrayList<SyntheticReadonlyColumnType> {
        public void readonlyColumn(Action<? super SyntheticReadonlyColumnTypeExtension> action) {
            SyntheticReadonlyColumnTypeExtension o = new SyntheticReadonlyColumnTypeExtension();
            action.execute(o);
            add(o);
        }
    }

    public static class SyntheticReadonlyRowidTypeListExtension extends ArrayList<SyntheticReadonlyRowidType> {
        public void readonlyRowid(Action<? super SyntheticReadonlyRowidTypeExtension> action) {
            SyntheticReadonlyRowidTypeExtension o = new SyntheticReadonlyRowidTypeExtension();
            action.execute(o);
            add(o);
        }
    }

    public static class SyntheticColumnTypeListExtension extends ArrayList<SyntheticColumnType> {
        public void column(Action<? super SyntheticColumnTypeExtension> action) {
            SyntheticColumnTypeExtension o = new SyntheticColumnTypeExtension();
            action.execute(o);
            add(o);
        }
    }

    public static class SyntheticIdentityTypeListExtension extends ArrayList<SyntheticIdentityType> {
        public void identity(Action<? super SyntheticIdentityTypeExtension> action) {
            SyntheticIdentityTypeExtension o = new SyntheticIdentityTypeExtension();
            action.execute(o);
            add(o);
        }
    }

    public static class SyntheticEnumTypeListExtension extends ArrayList<SyntheticEnumType> {
        public void enum_(Action<? super SyntheticEnumTypeExtension> action) {
            SyntheticEnumTypeExtension o = new SyntheticEnumTypeExtension();
            action.execute(o);
            add(o);
        }
    }

    public static class SyntheticPrimaryKeyTypeListExtension extends ArrayList<SyntheticPrimaryKeyType> {
        public void primaryKey(Action<? super SyntheticPrimaryKeyTypeExtension> action) {
            SyntheticPrimaryKeyTypeExtension o = new SyntheticPrimaryKeyTypeExtension();
            action.execute(o);
            add(o);
        }
    }

    public static class SyntheticUniqueKeyTypeListExtension extends ArrayList<SyntheticUniqueKeyType> {
        public void uniqueKey(Action<? super SyntheticUniqueKeyTypeExtension> action) {
            SyntheticUniqueKeyTypeExtension o = new SyntheticUniqueKeyTypeExtension();
            action.execute(o);
            add(o);
        }
    }

    public static class SyntheticForeignKeyTypeListExtension extends ArrayList<SyntheticForeignKeyType> {
        public void foreignKey(Action<? super SyntheticForeignKeyTypeExtension> action) {
            SyntheticForeignKeyTypeExtension o = new SyntheticForeignKeyTypeExtension();
            action.execute(o);
            add(o);
        }
    }

    public static class SyntheticViewTypeListExtension extends ArrayList<SyntheticViewType> {
        public void view(Action<? super SyntheticViewTypeExtension> action) {
            SyntheticViewTypeExtension o = new SyntheticViewTypeExtension();
            action.execute(o);
            add(o);
        }
    }

    public static class SyntheticDaoTypeListExtension extends ArrayList<SyntheticDaoType> {
        public void dao(Action<? super SyntheticDaoTypeExtension> action) {
            SyntheticDaoTypeExtension o = new SyntheticDaoTypeExtension();
            action.execute(o);
            add(o);
        }
    }

    public static class SyntheticDaoMethodTypeListExtension extends ArrayList<SyntheticDaoMethodType> {
        public void method(Action<? super SyntheticDaoMethodTypeExtension> action) {
            SyntheticDaoMethodTypeExtension o = new SyntheticDaoMethodTypeExtension();
            action.execute(o);
            add(o);
        }
    }

    public static class EmbeddableFieldListExtension extends ArrayList<EmbeddableField> {
        public void field(Action<? super EmbeddableFieldExtension> action) {
            EmbeddableFieldExtension o = new EmbeddableFieldExtension();
            action.execute(o);
            add(o);
        }
    }


}
