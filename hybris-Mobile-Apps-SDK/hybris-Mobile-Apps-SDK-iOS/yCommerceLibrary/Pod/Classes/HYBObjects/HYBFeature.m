//
// HYBFeature.m
// [y] hybris Platform
//
// Copyright (c) 2000-2016 hybris AG
// All rights reserved.
//
// This software is the confidential and proprietary information of hybris
// ("Confidential Information"). You shall not disclose such Confidential
// Information and shall use it only in accordance with the terms of the
// license agreement you entered into with hybris.
//
// Warning:This file was auto-generated by OCC2Ojbc.
//

#import "HYBFeature.h"
#import "NSValueTransformer+MTLPredefinedTransformerAdditions.h"

#import "HYBFeatureUnit.h"
#import "HYBFeatureValue.h"


@implementation HYBFeature

+ (instancetype)featureWithParams:(NSDictionary*)params {

NSError *error = nil;
HYBFeature *object = [MTLJSONAdapter modelOfClass:[HYBFeature class] fromJSONDictionary:params error:&error];

if (error) {
    NSLog(@"Couldn't convert JSON to model HYBFeature");
    return nil;
}

return object;
}

+ (NSDictionary *)JSONKeyPathsByPropertyKey {
   return @{
@"code" : @"code",
@"name" : @"name",
@"descriptor" : @"description",
@"type" : @"type",
@"range" : @"range",
@"comparable" : @"comparable",
@"featureUnit" : @"featureUnit",
@"featureValues" : @"featureValues"
};
}

+ (NSValueTransformer *)featureValuesJSONTransformer {
return [NSValueTransformer mtl_JSONArrayTransformerWithModelClass:[HYBFeatureValue class]];
}




+ (NSValueTransformer *)featureUnitJSONTransformer {
return [NSValueTransformer mtl_JSONDictionaryTransformerWithModelClass:[HYBFeatureUnit class]];
}



@end