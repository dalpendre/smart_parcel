# smart_parcel
Repo for a smart parcel application

Application to manage smart parcels of orders (these orders come from an external API like mock.api). The application has 
3 types of users, and they do:

# Product manufacter

- QA (quality assurance): data relative to the weather conditions (ex: temperature, humidity) during the transport of the parcel
or any deviations from the normal quality regulations, to be able to ensure the cost of a new product/deliver.

- Final client comsumption: data relating to the consumption of a certain packed package (ex: ink cartidge) to decide about the shipment of a new
parcel.

# Logistics operator

- Location and tracking: data relative to the real time location and tracking of each parcel, to ensure a faster delivery and garantee delivery
on time.

- Environmental conditions: data relative of temperature, humidity, acceleration (friction, buoyancy) and other environmental factors that ensure
that the products are handled securely.

- Security alerts: security data, like opening detection and non-authorized access alerts, to help the logistic operators ensure the safety
and integrity of the parcels during transport.

# Final customer

- Request additional packages for a parcel: every parcel has a default package

- Delivery updates: real-time data about the delivery, including estimated delivery times, the parcel location and notification when the parcel is
in the delivery stage.

- Quality information: data related to the environmental conditions during transport and the general quality of the product, which offers garanties
to the consumer about the product integrity.

- Security alerts: security data, like opening detection and non-authorized access alerts, to help the costumer ensure that the parcel
was not opened or unduly touched before the delivery.

- Final client comsumption: data relating to the consumption of a certain packed package (ex: ink cartidge) to decide about the order of a new
parcel.

An external data API (like mock.api) is used to simulate order, product, order_items and package data
