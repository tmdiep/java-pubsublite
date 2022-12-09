/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/pubsublite/v1/common.proto

package com.google.cloud.pubsublite.proto;

public final class CommonProto {
  private CommonProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_pubsublite_v1_AttributeValues_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_pubsublite_v1_AttributeValues_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_pubsublite_v1_PubSubMessage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_pubsublite_v1_PubSubMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_pubsublite_v1_PubSubMessage_AttributesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_pubsublite_v1_PubSubMessage_AttributesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_pubsublite_v1_Cursor_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_pubsublite_v1_Cursor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_pubsublite_v1_SequencedMessage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_pubsublite_v1_SequencedMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_pubsublite_v1_Reservation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_pubsublite_v1_Reservation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_pubsublite_v1_Topic_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_pubsublite_v1_Topic_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_pubsublite_v1_Topic_PartitionConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_pubsublite_v1_Topic_PartitionConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_pubsublite_v1_Topic_PartitionConfig_Capacity_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_pubsublite_v1_Topic_PartitionConfig_Capacity_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_pubsublite_v1_Topic_RetentionConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_pubsublite_v1_Topic_RetentionConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_pubsublite_v1_Topic_ReservationConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_pubsublite_v1_Topic_ReservationConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_pubsublite_v1_Subscription_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_pubsublite_v1_Subscription_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_pubsublite_v1_Subscription_DeliveryConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_pubsublite_v1_Subscription_DeliveryConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_pubsublite_v1_ExportConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_pubsublite_v1_ExportConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_pubsublite_v1_ExportConfig_PubSubConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_pubsublite_v1_ExportConfig_PubSubConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_pubsublite_v1_TimeTarget_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_pubsublite_v1_TimeTarget_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\'google/cloud/pubsublite/v1/common.prot"
          + "o\022\032google.cloud.pubsublite.v1\032\037google/ap"
          + "i/field_behavior.proto\032\031google/api/resou"
          + "rce.proto\032\036google/protobuf/duration.prot"
          + "o\032\037google/protobuf/timestamp.proto\"!\n\017At"
          + "tributeValues\022\016\n\006values\030\001 \003(\014\"\211\002\n\rPubSub"
          + "Message\022\013\n\003key\030\001 \001(\014\022\014\n\004data\030\002 \001(\014\022M\n\nat"
          + "tributes\030\003 \003(\01329.google.cloud.pubsublite"
          + ".v1.PubSubMessage.AttributesEntry\022.\n\neve"
          + "nt_time\030\004 \001(\0132\032.google.protobuf.Timestam"
          + "p\032^\n\017AttributesEntry\022\013\n\003key\030\001 \001(\t\022:\n\005val"
          + "ue\030\002 \001(\0132+.google.cloud.pubsublite.v1.At"
          + "tributeValues:\0028\001\"\030\n\006Cursor\022\016\n\006offset\030\001 "
          + "\001(\003\"\310\001\n\020SequencedMessage\0222\n\006cursor\030\001 \001(\013"
          + "2\".google.cloud.pubsublite.v1.Cursor\0220\n\014"
          + "publish_time\030\002 \001(\0132\032.google.protobuf.Tim"
          + "estamp\022:\n\007message\030\003 \001(\0132).google.cloud.p"
          + "ubsublite.v1.PubSubMessage\022\022\n\nsize_bytes"
          + "\030\004 \001(\003\"\250\001\n\013Reservation\022\014\n\004name\030\001 \001(\t\022\033\n\023"
          + "throughput_capacity\030\002 \001(\003:n\352Ak\n%pubsubli"
          + "te.googleapis.com/Reservation\022Bprojects/"
          + "{project}/locations/{location}/reservati"
          + "ons/{reservation}\"\367\005\n\005Topic\022\014\n\004name\030\001 \001("
          + "\t\022K\n\020partition_config\030\002 \001(\01321.google.clo"
          + "ud.pubsublite.v1.Topic.PartitionConfig\022K"
          + "\n\020retention_config\030\003 \001(\01321.google.cloud."
          + "pubsublite.v1.Topic.RetentionConfig\022O\n\022r"
          + "eservation_config\030\004 \001(\01323.google.cloud.p"
          + "ubsublite.v1.Topic.ReservationConfig\032\332\001\n"
          + "\017PartitionConfig\022\r\n\005count\030\001 \001(\003\022\023\n\005scale"
          + "\030\002 \001(\005B\002\030\001H\000\022N\n\010capacity\030\003 \001(\0132:.google."
          + "cloud.pubsublite.v1.Topic.PartitionConfi"
          + "g.CapacityH\000\032F\n\010Capacity\022\033\n\023publish_mib_"
          + "per_sec\030\001 \001(\005\022\035\n\025subscribe_mib_per_sec\030\002"
          + " \001(\005B\013\n\tdimension\032Y\n\017RetentionConfig\022\033\n\023"
          + "per_partition_bytes\030\001 \001(\003\022)\n\006period\030\002 \001("
          + "\0132\031.google.protobuf.Duration\032_\n\021Reservat"
          + "ionConfig\022J\n\026throughput_reservation\030\001 \001("
          + "\tB*\372A\'\n%pubsublite.googleapis.com/Reserv"
          + "ation:\\\352AY\n\037pubsublite.googleapis.com/To"
          + "pic\0226projects/{project}/locations/{locat"
          + "ion}/topics/{topic}\"\305\004\n\014Subscription\022\014\n\004"
          + "name\030\001 \001(\t\0223\n\005topic\030\002 \001(\tB$\372A!\n\037pubsubli"
          + "te.googleapis.com/Topic\022P\n\017delivery_conf"
          + "ig\030\003 \001(\01327.google.cloud.pubsublite.v1.Su"
          + "bscription.DeliveryConfig\022?\n\rexport_conf"
          + "ig\030\004 \001(\0132(.google.cloud.pubsublite.v1.Ex"
          + "portConfig\032\353\001\n\016DeliveryConfig\022i\n\024deliver"
          + "y_requirement\030\003 \001(\0162K.google.cloud.pubsu"
          + "blite.v1.Subscription.DeliveryConfig.Del"
          + "iveryRequirement\"n\n\023DeliveryRequirement\022"
          + "$\n DELIVERY_REQUIREMENT_UNSPECIFIED\020\000\022\027\n"
          + "\023DELIVER_IMMEDIATELY\020\001\022\030\n\024DELIVER_AFTER_"
          + "STORED\020\002:q\352An\n&pubsublite.googleapis.com"
          + "/Subscription\022Dprojects/{project}/locati"
          + "ons/{location}/subscriptions/{subscripti"
          + "on}\"\301\003\n\014ExportConfig\022E\n\rdesired_state\030\001 "
          + "\001(\0162..google.cloud.pubsublite.v1.ExportC"
          + "onfig.State\022J\n\rcurrent_state\030\006 \001(\0162..goo"
          + "gle.cloud.pubsublite.v1.ExportConfig.Sta"
          + "teB\003\340A\003\022B\n\021dead_letter_topic\030\005 \001(\tB\'\340A\001\372"
          + "A!\n\037pubsublite.googleapis.com/Topic\022N\n\rp"
          + "ubsub_config\030\003 \001(\01325.google.cloud.pubsub"
          + "lite.v1.ExportConfig.PubSubConfigH\000\032\035\n\014P"
          + "ubSubConfig\022\r\n\005topic\030\001 \001(\t\"\\\n\005State\022\025\n\021S"
          + "TATE_UNSPECIFIED\020\000\022\n\n\006ACTIVE\020\001\022\n\n\006PAUSED"
          + "\020\002\022\025\n\021PERMISSION_DENIED\020\003\022\r\n\tNOT_FOUND\020\004"
          + "B\r\n\013destination\"z\n\nTimeTarget\0222\n\014publish"
          + "_time\030\001 \001(\0132\032.google.protobuf.TimestampH"
          + "\000\0220\n\nevent_time\030\002 \001(\0132\032.google.protobuf."
          + "TimestampH\000B\006\n\004timeB\325\001\n!com.google.cloud"
          + ".pubsublite.protoB\013CommonProtoP\001ZDgoogle"
          + ".golang.org/genproto/googleapis/cloud/pu"
          + "bsublite/v1;pubsublite\370\001\001\252\002\032Google.Cloud"
          + ".PubSubLite.V1\312\002\032Google\\Cloud\\PubSubLite"
          + "\\V1\352\002\035Google::Cloud::PubSubLite::V1b\006pro"
          + "to3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_pubsublite_v1_AttributeValues_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_pubsublite_v1_AttributeValues_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_pubsublite_v1_AttributeValues_descriptor,
            new java.lang.String[] {
              "Values",
            });
    internal_static_google_cloud_pubsublite_v1_PubSubMessage_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_pubsublite_v1_PubSubMessage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_pubsublite_v1_PubSubMessage_descriptor,
            new java.lang.String[] {
              "Key", "Data", "Attributes", "EventTime",
            });
    internal_static_google_cloud_pubsublite_v1_PubSubMessage_AttributesEntry_descriptor =
        internal_static_google_cloud_pubsublite_v1_PubSubMessage_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_pubsublite_v1_PubSubMessage_AttributesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_pubsublite_v1_PubSubMessage_AttributesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_pubsublite_v1_Cursor_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_pubsublite_v1_Cursor_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_pubsublite_v1_Cursor_descriptor,
            new java.lang.String[] {
              "Offset",
            });
    internal_static_google_cloud_pubsublite_v1_SequencedMessage_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_pubsublite_v1_SequencedMessage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_pubsublite_v1_SequencedMessage_descriptor,
            new java.lang.String[] {
              "Cursor", "PublishTime", "Message", "SizeBytes",
            });
    internal_static_google_cloud_pubsublite_v1_Reservation_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_pubsublite_v1_Reservation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_pubsublite_v1_Reservation_descriptor,
            new java.lang.String[] {
              "Name", "ThroughputCapacity",
            });
    internal_static_google_cloud_pubsublite_v1_Topic_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_pubsublite_v1_Topic_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_pubsublite_v1_Topic_descriptor,
            new java.lang.String[] {
              "Name", "PartitionConfig", "RetentionConfig", "ReservationConfig",
            });
    internal_static_google_cloud_pubsublite_v1_Topic_PartitionConfig_descriptor =
        internal_static_google_cloud_pubsublite_v1_Topic_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_pubsublite_v1_Topic_PartitionConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_pubsublite_v1_Topic_PartitionConfig_descriptor,
            new java.lang.String[] {
              "Count", "Scale", "Capacity", "Dimension",
            });
    internal_static_google_cloud_pubsublite_v1_Topic_PartitionConfig_Capacity_descriptor =
        internal_static_google_cloud_pubsublite_v1_Topic_PartitionConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_pubsublite_v1_Topic_PartitionConfig_Capacity_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_pubsublite_v1_Topic_PartitionConfig_Capacity_descriptor,
            new java.lang.String[] {
              "PublishMibPerSec", "SubscribeMibPerSec",
            });
    internal_static_google_cloud_pubsublite_v1_Topic_RetentionConfig_descriptor =
        internal_static_google_cloud_pubsublite_v1_Topic_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_pubsublite_v1_Topic_RetentionConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_pubsublite_v1_Topic_RetentionConfig_descriptor,
            new java.lang.String[] {
              "PerPartitionBytes", "Period",
            });
    internal_static_google_cloud_pubsublite_v1_Topic_ReservationConfig_descriptor =
        internal_static_google_cloud_pubsublite_v1_Topic_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_pubsublite_v1_Topic_ReservationConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_pubsublite_v1_Topic_ReservationConfig_descriptor,
            new java.lang.String[] {
              "ThroughputReservation",
            });
    internal_static_google_cloud_pubsublite_v1_Subscription_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_pubsublite_v1_Subscription_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_pubsublite_v1_Subscription_descriptor,
            new java.lang.String[] {
              "Name", "Topic", "DeliveryConfig", "ExportConfig",
            });
    internal_static_google_cloud_pubsublite_v1_Subscription_DeliveryConfig_descriptor =
        internal_static_google_cloud_pubsublite_v1_Subscription_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_pubsublite_v1_Subscription_DeliveryConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_pubsublite_v1_Subscription_DeliveryConfig_descriptor,
            new java.lang.String[] {
              "DeliveryRequirement",
            });
    internal_static_google_cloud_pubsublite_v1_ExportConfig_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_pubsublite_v1_ExportConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_pubsublite_v1_ExportConfig_descriptor,
            new java.lang.String[] {
              "DesiredState", "CurrentState", "DeadLetterTopic", "PubsubConfig", "Destination",
            });
    internal_static_google_cloud_pubsublite_v1_ExportConfig_PubSubConfig_descriptor =
        internal_static_google_cloud_pubsublite_v1_ExportConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_pubsublite_v1_ExportConfig_PubSubConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_pubsublite_v1_ExportConfig_PubSubConfig_descriptor,
            new java.lang.String[] {
              "Topic",
            });
    internal_static_google_cloud_pubsublite_v1_TimeTarget_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_pubsublite_v1_TimeTarget_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_pubsublite_v1_TimeTarget_descriptor,
            new java.lang.String[] {
              "PublishTime", "EventTime", "Time",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
