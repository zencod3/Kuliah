CREATE TABLE action (
    actionid                INTEGER NOT NULL,
    description             VARCHAR2(255) NOT NULL,
    ticket_ticketid         INTEGER NOT NULL,
    user_userid             INTEGER NOT NULL,
    department_departmentid INTEGER NOT NULL
)
LOGGING;

ALTER TABLE action ADD CONSTRAINT action_pk PRIMARY KEY ( actionid );

CREATE TABLE category (
    categoryid INTEGER NOT NULL,
    name       VARCHAR2(255) NOT NULL
)
LOGGING;

ALTER TABLE category ADD CONSTRAINT category_pk PRIMARY KEY ( categoryid );

CREATE TABLE "Comment" (
    commentid       INTEGER NOT NULL,
    text            VARCHAR2(255) NOT NULL,
    createddate     DATE NOT NULL,
    ticket_ticketid INTEGER NOT NULL,
    user_userid     INTEGER NOT NULL
)
LOGGING;

ALTER TABLE "Comment" ADD CONSTRAINT comment_pk PRIMARY KEY ( commentid );

CREATE TABLE department (
    departmentid INTEGER NOT NULL,
    name         VARCHAR2(255) NOT NULL
)
LOGGING;

ALTER TABLE department ADD CONSTRAINT department_pk PRIMARY KEY ( departmentid );

CREATE TABLE priority (
    priorityid INTEGER NOT NULL,
    name       VARCHAR2(255) NOT NULL,
    "Level"    VARCHAR2(255) NOT NULL
)
LOGGING;

ALTER TABLE priority ADD CONSTRAINT priority_pk PRIMARY KEY ( priorityid );

CREATE TABLE redemption (
    redemptionid    INTEGER NOT NULL,
    tanggal_redeem  DATE,
    status_redeem   VARCHAR2(255),
    ticket_ticketid INTEGER NOT NULL,
    user_userid     INTEGER NOT NULL,
    reward_rewardid INTEGER NOT NULL
)
LOGGING;

ALTER TABLE redemption ADD CONSTRAINT redemption_pk PRIMARY KEY ( redemptionid );

CREATE TABLE reward (
    rewardid         INTEGER NOT NULL,
    name             VARCHAR2(255) NOT NULL,
    deskripsi_reward VARCHAR2(255) NOT NULL,
    jenis_reward     VARCHAR2(255) NOT NULL
)
LOGGING;

ALTER TABLE reward ADD CONSTRAINT reward_pk PRIMARY KEY ( rewardid );

CREATE TABLE ticket (
    ticketid                INTEGER NOT NULL,
    title                   VARCHAR2(255) NOT NULL,
    description             VARCHAR2(255) NOT NULL,
    priority_priorityid     INTEGER NOT NULL,
    category_categoryid     INTEGER NOT NULL,
    user_userid             INTEGER NOT NULL,
    department_departmentid INTEGER NOT NULL
)
LOGGING;

ALTER TABLE ticket ADD CONSTRAINT ticket_pk PRIMARY KEY ( ticketid );

CREATE TABLE "User" (
    userid                  INTEGER NOT NULL,
    name                    VARCHAR2(255) NOT NULL,
    email                   VARCHAR2(255) NOT NULL,
    password                VARCHAR2(255) NOT NULL,
    role                    VARCHAR2(255),
    department_departmentid INTEGER NOT NULL
)
LOGGING;

ALTER TABLE "User" ADD CONSTRAINT user_pk PRIMARY KEY ( userid );

ALTER TABLE action
    ADD CONSTRAINT action_department_fk FOREIGN KEY ( department_departmentid )
        REFERENCES department ( departmentid )
    NOT DEFERRABLE;

ALTER TABLE action
    ADD CONSTRAINT action_ticket_fk FOREIGN KEY ( ticket_ticketid )
        REFERENCES ticket ( ticketid )
    NOT DEFERRABLE;

ALTER TABLE action
    ADD CONSTRAINT action_user_fk FOREIGN KEY ( user_userid )
        REFERENCES "User" ( userid )
    NOT DEFERRABLE;

ALTER TABLE "Comment"
    ADD CONSTRAINT comment_ticket_fk FOREIGN KEY ( ticket_ticketid )
        REFERENCES ticket ( ticketid )
    NOT DEFERRABLE;

ALTER TABLE "Comment"
    ADD CONSTRAINT comment_user_fk FOREIGN KEY ( user_userid )
        REFERENCES "User" ( userid )
    NOT DEFERRABLE;

ALTER TABLE redemption
    ADD CONSTRAINT redemption_reward_fk FOREIGN KEY ( reward_rewardid )
        REFERENCES reward ( rewardid )
    NOT DEFERRABLE;

ALTER TABLE redemption
    ADD CONSTRAINT redemption_ticket_fk FOREIGN KEY ( ticket_ticketid )
        REFERENCES ticket ( ticketid )
    NOT DEFERRABLE;

ALTER TABLE redemption
    ADD CONSTRAINT redemption_user_fk FOREIGN KEY ( user_userid )
        REFERENCES "User" ( userid )
    NOT DEFERRABLE;

ALTER TABLE ticket
    ADD CONSTRAINT ticket_category_fk FOREIGN KEY ( category_categoryid )
        REFERENCES category ( categoryid )
    NOT DEFERRABLE;

ALTER TABLE ticket
    ADD CONSTRAINT ticket_department_fk FOREIGN KEY ( department_departmentid )
        REFERENCES department ( departmentid )
    NOT DEFERRABLE;

ALTER TABLE ticket
    ADD CONSTRAINT ticket_priority_fk FOREIGN KEY ( priority_priorityid )
        REFERENCES priority ( priorityid )
    NOT DEFERRABLE;

ALTER TABLE ticket
    ADD CONSTRAINT ticket_user_fk FOREIGN KEY ( user_userid )
        REFERENCES "User" ( userid )
    NOT DEFERRABLE;

ALTER TABLE "User"
    ADD CONSTRAINT user_department_fk FOREIGN KEY ( department_departmentid )
        REFERENCES department ( departmentid )
    NOT DEFERRABLE;