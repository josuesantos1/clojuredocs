(ns clojuredocs.schema.var)


(def var*
  [{:db/ident       :vars/id
    :db/valueType   :db.type/uuid
    :db/cardinality :db.cardinality/one
    :db/unique      :db.unique/identity}
   {:db/ident       :vars/namespace
    :db/valueType   :db.type/ref
    :db/cardinality :db.cardinality/one}
   {:db/ident       :vars/name
    :db/valueType   :db.type/string
    :db/cardinality :db.cardinality/one}
   {:db/ident       :vars/arglist
    :db/valueType   :db.type/string
    :db/cardinality :db.cardinality/one}
   {:db/ident       :vars/doc
    :db/valueType   :db.type/string
    :db/cardinality :db.cardinality/one}
   {:db/ident       :vars/added
    :db/valueType   :db.type/string
    :db/cardinality :db.cardinality/one}])
