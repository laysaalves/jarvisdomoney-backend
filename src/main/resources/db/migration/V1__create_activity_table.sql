CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE tbl_activity (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    title VARCHAR(255),
    price NUMERIC(19, 2),
    type VARCHAR(50),
    method VARCHAR(50),
    status VARCHAR(50),
    created_at TIMESTAMP,
    updated_at TIMESTAMP,
    deleted_at TIMESTAMP
);
