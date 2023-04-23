(ns clojuredocs.schema.example)

(def example
  [{:db/ident       :example/id
    :db/valueType   :db.type/uuid
    :db/cardinality :db.cardinality/one
    :db/unique      :db.unique/identity}
   {:db/ident       :example/var
    :db/valueType   :db.type/ref
    :db/cardinality :db.cardinality/one}
   {:db/ident       :example/content
    :db/valueType   :db.type/string
    :db/cardinality :db.cardinality/one}])
