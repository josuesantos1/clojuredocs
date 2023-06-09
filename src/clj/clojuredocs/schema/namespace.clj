(ns clojuredocs.schema.namespace)

(def namespace*
  [{:db/ident       :namespace/id
    :db/valueType   :db.type/uuid
    :db/cardinality :db.cardinality/one
    :db/unique      :db.unique/identity}
   {:db/ident       :namespace/name
    :db/valueType   :db.type/string
    :db/cardinality :db.cardinality/one}
   {:db/ident       :namespace/description
    :db/valueType   :db.type/string
    :db/cardinality :db.cardinality/one}])
