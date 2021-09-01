create table public.phone
(
    id              SERIAL PRIMARY KEY NOT NULL,
    phone_number    TEXT
);

CREATE
UNIQUE INDEX phone_id_uindex ON public.phone(id);

create table public.contact
(
    id         SERIAL NOT NULL,
    name       TEXT,
    birthday   DATA,
    phone_id   INT PRIMARY KEY,
    CONSTRAINT contact_id_uindex foreign key (phone_id) REFERENCES phone (id)
);

CREATE
UNIQUE index contact_id_uindex ON public.contact(id)