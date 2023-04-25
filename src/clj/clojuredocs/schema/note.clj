(ns clojuredocs.schema.note)


(def note
  [{:db/ident       :note/id
    :db/valueType   :db.type/uuid
    :db/cardinality :db.cardinality/one
    :db/unique      :db.unique/identity}
   {:db/ident       :note/liked
    :db/valueType   :db.type/ref
    :db/cardinality :db.cardinality/many
    :db/doc         "list from users"}
   {:db/ident       :note/var
    :db/valueType   :db.type/ref
    :db/cardinality :db.cardinality/one}
   {:db/ident       :note/content
    :db/valueType   :db.type/string
    :db/cardinality :db.cardinality/one}])
