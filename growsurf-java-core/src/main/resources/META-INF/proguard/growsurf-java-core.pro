# Jackson uses reflection and depends heavily on runtime attributes.
-keepattributes Exceptions,InnerClasses,Signature,Deprecated,*Annotation*

# Jackson uses Kotlin reflection utilities, which themselves use reflection to access things.
-keep class kotlin.reflect.** { *; }
-keep class kotlin.Metadata { *; }

# Jackson uses reflection to access enum members (e.g. via `java.lang.Class.getEnumConstants()`).
-keepclassmembers class com.fasterxml.jackson.** extends java.lang.Enum {
    <fields>;
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

# Jackson uses reflection to access annotation members.
-keepclassmembers @interface com.fasterxml.jackson.annotation.** {
    *;
}

# Jackson uses reified type information to serialize and deserialize our classes (via `TypeReference`).
-keep class com.fasterxml.jackson.core.type.TypeReference { *; }
-keep class * extends com.fasterxml.jackson.core.type.TypeReference { *; }

# Jackson uses reflection to access our class serializers and deserializers.
-keep @com.fasterxml.jackson.databind.annotation.JsonSerialize class com.growsurf.api.** { *; }
-keep @com.fasterxml.jackson.databind.annotation.JsonDeserialize class com.growsurf.api.** { *; }

# @ExcludeMissing is a @JacksonAnnotationsInside bundling annotation whose @JsonInclude value filter
# (JsonField.IsMissing) tells Jackson to omit JsonMissing properties from serialized output. Shrinking
# doesn't treat the bundling annotation or its class-literal value filter as a use, so keep both —
# otherwise the filter is dropped, a JsonMissing value reaches the serializer, and serialization throws
# "JsonMissing cannot be serialized" for any unset property.
-keep @interface com.growsurf.api.core.ExcludeMissing { *; }
-keep class com.growsurf.api.core.JsonField$IsMissing { *; }

# Jackson uses reflection to serialize and deserialize our classes based on their constructors and annotated members.
-keepclassmembers class com.growsurf.api.** {
    <init>(...);
    @com.fasterxml.jackson.annotation.* *;
}